import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] s1 = s.toCharArray(); //-48
        int[] s2 = new int[s.length()];
        for(int i=0;i<s.length();i++){
            s2[i]=s1[i]-48;
        }int tmp=s.length()-1;int plus=0;int result=0;int repeat=0;
        while(tmp>=0){
            plus+=s2[tmp]*Math.pow(10,repeat);
            if(plus%2019==0){
                result++;
                repeat=-1;
                plus=0;tmp++;
            }
            tmp--;
            repeat++;
        }
        System.out.println(result);
    }
    }