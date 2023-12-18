import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main{
  private static int rmc = 0;
  public static void main(String args[]){
    int n, m;
    ArrayList<int[]> input = new ArrayList<>();

	Scanner scanner = new Scanner(System.in);
	String str = scanner.nextLine();;
	String[] tmp = str.split(" ");
	n = Integer.parseInt(tmp[0]);
	m = Integer.parseInt(tmp[1]);
	String str2;
	while(scanner.hasNextLine()){
        str2 = scanner.nextLine();
		String[] tmp2 = str2.split(" ");
		int nums[] = new int[2];
		nums[0] = Integer.parseInt(tmp2[0]);
		nums[1] = Integer.parseInt(tmp2[1]);
		input.add(nums);
	}
	scanner.close();
	int kekka = n + count(input);
    System.out.println(kekka);
  }
  
  public static int count(ArrayList<int[]> list){
    int result = 0;
    int c = 0;
  	for(int[] val : list){
      	if(val[0] != 0 && val[1] != 0){
          rm(list,val[0]);
          rm(list,val[1]);
          result++;
          c+=2;
          continue;
        }else if(val[0] == 0 && val[1] != 0){
          rm(list,val[1]);
          c++;
          continue;
        }else if(val[0] != 0 && val[1] == 0){
          rm(list,val[0]);
          c++;
          continue;
        }
    }
    
    result -= c;
    return result;
  }
    
    
  public static void rm(ArrayList<int[]> list, int target){
    for(int[] val : list){
      if(val[0] == target){
          val[0] = 0;
      }else if(val[1] == target){
        val[1] = 0;
      }
    }
  }
  
  public static void print(ArrayList<int[]> list){
	for(int[] val : list){
		System.out.println(val[0] + ":" + val[1]);
    }
    System.out.println("----------------------------");
  }
}