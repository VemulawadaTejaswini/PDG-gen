import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String args[]) {

	Scanner std = new Scanner(System.in);

	int N = std.nextInt();
	//List<Integer> list = new ArrayList<>();
	List<List<Integer>> list = new ArrayList<>();
	int D = std.nextInt();
	//int B = std.nextInt();
	//int C = std.nextInt();
	//int temp = 0;
	//int[][] X = new int[D][];

	for(int i = 0; i < N; i++) {
		List<Integer> list2 = new ArrayList<>();
		for(int j = 0; j < D; j++) {
		int a = std.nextInt();
		list2.add(a);
		}
		list.add(list2);
	}

	System.out.println(nCombination2(list));

	//for(int i = 0; i < N; i++) {
	//	for(int j = 0; j < D; j++) {
	//	int b = list.get(i).get(j) - list.get(i).get(j+1)  ;
	//	}
	//}


	}


	public static int nCombination2(List<List<Integer>> list) {
        int count = list.size();
        int num = 0;
        double a = 0;
        double z;
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
            	for(int k = 0; k < list.get(0).size(); k++) {
              z = list.get(i).get(k) - list.get(j).get(k);
              a = a + Math.pow(z,2); //num++;
            	}
            double b = Math.sqrt(a);
              if(b == (int)b) {
            	  num++;
              }

              }
               // System.out.print(num + " {" + list[i] + ", " + list[j] + "}\t");
            }
            //System.out.println();
        return num;}
        //System.out.println("[answer] " + count + "C2 : " + num);
    }


