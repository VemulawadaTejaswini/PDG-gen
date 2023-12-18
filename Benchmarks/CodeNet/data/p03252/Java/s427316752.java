import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        try{
            String S = scan.next();
            String T = scan.next();

            int[] s = new int[26];
            int[] t = new int[26];

            for(int i = 0; i < S.length(); i++){
                s[S.charAt(i)-97]++;
                t[T.charAt(i)-97]++;
            }

            int flag = 0;
            for(int i = 0; i < 26; i++){
                if(s[i] == t[i]){
                    //何もしない
                }else{
                    int index = getDiff(s[i]-t[i], i, s, t);
                    if(index == -1){
                        System.out.println("No");
                        flag = 1;
                        break;
                    }else{
                        /*
                        System.out.println("index : "+index+" , i : "+i);
                        System.out.println("index : "+(char)(index+97)+" , i : "+(char)(i+97));
                        */
                        if(s[i]-t[i] < 0){
                            s[i] += s[index];
                            s[index] = 0;
                        }else{
                            s[index] += s[i];
                            s[i] = 0;
                        }
                    }
                }
            }
            if(flag == 1){

            }else{
                System.out.println("Yes");
            }


        }finally{
            scan.close();
        }
    }

    static int getDiff(int diff, int index, int[] s, int[] t){
        int diffIndex = -1;
        for(int i = 0; i < 26; i++){
            if(t[i]-s[i] == diff){
                diffIndex = i;
                break;
            }
        }
        return diffIndex;
    }
}
