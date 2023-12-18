import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int t[];
        t = new int[n];
        int a[];
        a = new int[n];
        int maxt = 0;
        int maxa = 0;
        int mint = 0;
        int mina = 0;
        int answer = 0;
        int c[];
        c = new int[n];
        for(int i = 0; i<n; i++){
		t[i] = sc.nextInt();
            if(maxt < t[i]){
                maxt = t[i];
            }
            else if(mint > t[i]){
                mint = t[i];
            }
            if(i>0 && t[i] != t[i-1]){
                c[i] = t[i];
            }
            else{
                c[i] = 0;
            }
        }
        int cc = 1;
        for(int i = 0; i<n; i++){
		a[i] = sc.nextInt();
            if(maxa < a[i]){
                maxa = a[i];
            }
            else if(mina > a[i]){
                mina = a[i];
            }
            if(i>0 && a[i] != a[i-1] && c[i] == 0){
                c[i-1] = a[i-1];
            }
        }
        for(int i=0; i<c.length; i++){
            if(c[i] == 0){
                if(t[i]>a[i]){
                    cc = cc * a[i];
                }
                else{
                    cc = cc * t[i];
                }
            }
        }
        if(maxa != maxt){
            System.out.println(answer);
        }
        else{

            System.out.println(cc);
        }
	}
}