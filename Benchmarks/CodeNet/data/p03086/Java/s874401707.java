import java.util.*;

class Main{
    public static void main(String[] arsg){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("");
        int ans = 0;
        int count = 0;
        for(int i = 0;i < str.length-1;i++){
            switch(str[i]){
                case "A":
                    count++;
                    break;
                case "C":
                    count++;
                    break;
                case "G":
                    count++;
                    break;
                case "T":
                    count++;
                    break;
                default:
                    if(ans < count){
                        ans = count;
                        count = 0;
                    }
            }

        }
        System.out.println(ans);
    }
}