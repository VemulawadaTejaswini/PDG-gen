import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int d = sc.nextInt();
        int Lx[]=new int[90001];int Ly[]=new int[900001];
        
        for(int i=0;i<h;i++){
        for(int j=0;j<w;j++){
            int a=sc.nextInt();
            Lx[a]=i;Ly[a]=j;
        }
    }
    int q=sc.nextInt();
    for(int i=0;i<q;i++){
        int power=0;
        int l=sc.nextInt();int r=sc.nextInt();
        while(l!=r){
            power+=(Math.abs(Lx[l]-Lx[l+d])+Math.abs(Ly[l]-Ly[l+d]));
            l+=d;
        }
        System.out.println(power);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        }
    }
}
