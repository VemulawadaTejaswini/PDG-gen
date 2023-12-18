import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b=sc.nextInt();
        char[] s = sc.next().toCharArray();
        String ans = "Yes";
        for(int i = 0;i<s.length;i++){
            if(i!=a&&s[i]=='-'){
                ans = "No";
                break;
            } else if(i==a&&s[i]!='-'){
                ans = "No";
                break;
            }
        }
        System.out.println(ans);
    }
}