import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        int []t=new int[n];
        int []a=new int [n];
        for(int i=0;i<n;i++){
            t[i]=scan.nextInt();
            a[i]=scan.nextInt();
        }

        int votet=t[0],votea=a[0];
        for(int i=1;i<n;i++){
            while(votea*t[i]!=votet*a[i]){
                if(votea*t[i]<votet*a[i])
                    votea++;
                else
                    votet++;
            }
           // System.out.println(votea +" " + votet);
        }
        System.out.println(votea+votet);
        
    }
}