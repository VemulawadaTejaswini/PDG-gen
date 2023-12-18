import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] in = new int [32];
        in [0]= 1; in [1]=1;in [2]= 1; in [3]=2; in [4]=1; in [5]=2; 
      in [6]=1;in [7]= 5; in [8]=2; in [9]=2;in [10]= 1;in [11]=5;
      in [12]=1; in [13]=2; in [14]=1;in [15]= 14; 
      in [16]=1;in [17]= 5; in [18]=1; in [19]=5; in [20]= 2;in [21]= 2;
      in [22]=1; in [23]=15; in [24]=2; in [25]=2; in [26]=5;in [27]= 4; in [28]=1;
      in [29]=4; in [30]=1;in [31]= 51;
		int b = in[a-1];
        System.out.println(b);
	}
}
