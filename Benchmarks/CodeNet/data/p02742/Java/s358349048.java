import java.util.*;

class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
      	int h = sc.nextInt();
      	int z = m * h;
      	int N = z / 2;
     	if(z % 2 != 0){
         	N += 1; 
        }
        System.out.println(N);
	}

}