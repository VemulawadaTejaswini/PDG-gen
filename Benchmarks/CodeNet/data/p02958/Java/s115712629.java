import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
        int[] p = new int[n], index = new int[3];
        int i = 0, j = 0, flag = 0;
        while(i<n){
            p[i] = scan.nextInt();
            if(flag<=2&&p[i]!=i+1){
                flag++;
                index[j] = i;
                j++;
            }
            i++;
        }
        if(flag==0)
            System.out.println("YES");
        else if(flag>2)
            System.out.println("NO");
        else{
            if(p[index[0]]==index[1]+1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
	}
}