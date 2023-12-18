import java.util.Scanner;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int c[]=new int[a];
        int d[]=new int[a];
        for(int i=0;i!=a;i++) {
        	c[i]=sc.nextInt();
        	d[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i!=a;i++) {
        	for(;;) {
        	if((c[i]+count)%d[i]==0) {
        		break;
        	}
        	count++;
        	}
        }
        System.out.println(count);
    }
}