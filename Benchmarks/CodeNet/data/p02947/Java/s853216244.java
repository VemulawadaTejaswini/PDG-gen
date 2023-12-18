import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int n = sc.nextInt();
        sc.nextLine();
        String str[] = new String[n];
        for(int i=0;i<n;i++) {
            str[i] = sc.nextLine();
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                char ch1[] = str[i].toCharArray();
                char ch2[] = str[j].toCharArray();
                int a = 0;
                for(int k=0;k<10;k++){
                    for(int l=0;l<10;l++){
                        if(ch1[k]==ch2[l]){
                            ch2[l] = '0';
                            a++;
                        }
                    }
                }
                if(a==10){
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}