import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] s1 = s.toCharArray();
        int[] s2 = new int[s.length()];
        for(int i=0;i<s.length();i++){
            s2[i]=s1[i]-48;
        }int tmp=s.length()-1;int plus=0;int result=0;
        for(int i=tmp;i>3;i--){
            int repeat=1;
            plus=s2[i];
            for(int j=i-1;j>=0;j--){
                plus+=s2[j]*Math.pow(10,repeat);
                if(plus%2019==0)
                    result++;
                repeat++;
            }
        }
        System.out.println(result);
    }
    }