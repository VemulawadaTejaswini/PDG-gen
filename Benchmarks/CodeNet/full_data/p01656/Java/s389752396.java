import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int a=0;
        int[] year=new int[n];
        String[] name=new String[n];
        for(int i=0; i<n; i++) {
        	year[i]=sc.nextInt();
        	name[i]=sc.nextLine();
        }
        for(int i=0; i<n; i++) {
        	if(0<=q && year[0]>q) {
        		a=0;
        		break;
        	}else if(year[i]<=q && year[i+1]>q) {
        		a=i;
        		break;
        	}else if(year[n-1]<q) {
        		a=n-1;
        		break;
        	}
        }
        System.out.println(name[a].trim());
     }
}
