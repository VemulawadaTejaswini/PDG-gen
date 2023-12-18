
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        int[] c = new int[s.length];
        boolean isR = true;
        int mass = 0;
        int left = 0;
        for(int i=0;i<s.length-1;i++){
            mass++;
            if(s[i].equals("R") && s[i+1].equals("L")){
                int tmp = (mass%2==0) ? mass/2 : (mass+1)/2;
                c[i] += tmp;
                c[i+1] += (mass-tmp);
                left = i+1;
                mass = 0;
                if(i+1 == s.length-1)c[i+1]=1;
            }
            if(s[i].equals("L") && s[i+1].equals("R")){
                int tmp = (mass%2==0) ? mass/2 : (mass+1)/2;
                c[left] += tmp;
                c[left-1] += (mass-tmp);
                mass = 0;
            }
            if(i+1 == s.length-1){
                mass++;
                int tmp = (mass%2==0) ? mass/2 : (mass+1)/2;
                c[left] += tmp;
                c[left-1] += (mass-tmp);
            }
        }
        for(int i=0;i<s.length;i++){
            System.out.print(c[i] + " ");
        }
    }
}