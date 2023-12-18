import java.util.Scanner;
import java.util.Arrays;


class Main{
    public static void main(String args[]){
	Scanner scan  = new Scanner(System.in);
	int n = scan.nextInt() * 2;
	int total = 0;
	int[] l = new int[n];
        for(int i=0;i<n;i++){
            l[i] = scan.nextInt();
        }
        Arrays.sort(l);
	for(int i=0;i<n;i++){
            if(i%2==0)total += l[i];
        }
        System.out.println(total);
    }
}

