import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
        String a = sc.nextLine();
        int b = sc.nextInt();
        int i = 0,flag=0;
        String a1, a2;
        char d[];
        for (i = 0; i < b; i++) {
            char e = sc.nextLine().toCharArray();
            d[i]=e; 

            if(d[0]==('-')){
                flag=1;
                break;
            }
            int c=d[i]-'0';
            a1=a.substring(0,c);
            a2=a.substring(c+1);
            a=a2+a1;
        }
        if(flag==1)break;
        System.out.printf("%s",a);
    }
        sc.close();
    }
