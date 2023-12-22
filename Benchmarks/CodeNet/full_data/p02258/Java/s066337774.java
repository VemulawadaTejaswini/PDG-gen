import java.util.Scanner;

public class Main{
 
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int i,j,n,max=0,min=0,dist=0;
        n=scan.nextInt();
        int r[]=new int [n];
        for(i=0;i<n;i++) {
            r[i]=scan.nextInt();
            if(r[max]<r[i]) {
                max=i;
            }
            if(r[min]>r[i]) {
                min=i;
            }
        }
        if(min<max) {
            System.out.println(r[max]-r[min]);
            scan.close();
            return;
        }
        
        min=r[0];
        for(i=1;i<n;i++){
        	if(i==1){
        		dist=r[i]-min;
        	}
        	if(dist<r[i]-min){
        		dist=r[i]-min;
        	}
        	if(min>r[i]){
        		min=r[i];
        	}
        }
        System.out.println(dist);
        scan.close();
    }
}

