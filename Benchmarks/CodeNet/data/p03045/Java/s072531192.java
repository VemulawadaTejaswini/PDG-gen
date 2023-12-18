import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String args[]){
    int n, m;
    ArrayList<Integer> x = new ArrayList<Integer>();
    ArrayList<Integer> y = new ArrayList<Integer>();
    int result = 0;
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    String[] nums = str.split(" ");
    n = Integer.parseInt(nums[0]);
    m = Integer.parseInt(nums[1]);
    
    while(scan.hasNextLine()){
        String str2 = scan.next();
      	String[] nums2 = str2.split(" ");
        x.add(Integer.parseInt(nums2[0]));
        y.add(Integer.parseInt(nums2[1]));
    }
    
    int input[][] = new int[m][2];
    
    for(int i = 0; i < m; i++){
      input[i][0] = x.get(i);
      input[i][1] = y.get(i);
    }
    
    for(int i = 0; i < m; i++){
      if(input[i][0] != 0){
        int tmp = input[i][0];
        input[i][0] = 0;
        for(int j = i + 1; j < m; j++){
          if(input[j][0] == tmp){
          	input[j][0] = 0;
          }else if(input[j][1] == tmp){
          	input[j][1] = 0;
          }
        }
        result++;
      }
    }
  
    for(int i = 0; i < m; i++){
      if(input[i][1] != 0){
        int tmp = input[i][1];
        input[i][1] = 0;
        for(int j = i + 1; j < m; j++){
          if(input[j][0] == tmp){
          	input[j][0] = 0;
          }else if(input[j][1] == tmp){
          	input[j][1] = 0;
          }
        }
        result++;
      }
    }
    System.out.println(result);
  }
}
