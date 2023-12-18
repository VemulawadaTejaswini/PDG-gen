import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int max = 0;
        //アルファベットあるかな
        boolean[] ar1 = new boolean[26];
        boolean[] ar2 = new boolean[26];
        //区切るところを変えて探す
        for (int i=1;i<N;i++){
            String str1 = S.substring(0,i);
            String str2 = S.substring(i);
            int count = 0;
            for (int j=0;j<str1.length();j++){//前半
                ar1[str1.charAt(j)-'a']=true;
            }
            for (int j=0;j<str2.length();j++){//後半
                ar2[str2.charAt(j)-'a']=true;
            }
            for (int j=0;j<26;j++){//両方にあるか
                if(ar1[j] && ar2[j]){
                  count++;
                }
            }
            max = Math.max(max,count);
        }
        System.out.println(max);
    }
