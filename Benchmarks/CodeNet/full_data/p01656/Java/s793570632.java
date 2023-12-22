import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int[] year=new int[n+1];
        String[] name=new String[n+1];
        for(int i=0; i<n; i++) {
        	year[i]=sc.nextInt();
        	name[i]=sc.nextLine();
        }
        for(int i=0; i<n; i++) {
        	if(0<=q && year[0]>q) {
        		System.out.println("kogakubu10gokan");
        		break;
        	}else if(year[i]<=q && year[i+1]>q) {
        		System.out.println(name[i].trim());
        		break;
        	}else if(year[n-1]<=q) {
        		System.out.println(name[n-1].trim());
        		break;
        	}
        }
     }
}
