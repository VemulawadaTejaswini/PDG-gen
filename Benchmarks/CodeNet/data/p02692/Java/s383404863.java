import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            String s = sc.next();
            switch(s){
                case "AB":
                    if(a > b){
                        a--;
                        b++;
                        sb.append("B\n");
                    }else if(a < b){
                        a++;
                        b--;
                        sb.append("A\n");
                    }else{
                        a--;
                        b++;
                        sb.append("B\n");
                    }
                    break;
                case "AC":
                    if(a > c){
                        a--;
                        c++;
                        sb.append("C\n");
                    }else if(a < c){
                        a++;
                        c--;
                        sb.append("A\n");
                    }else{
                        a++;
                        c--;
                        sb.append("A\n");
                    }
                    break;
                case "BC":
                    if(b > c){
                        b--;
                        c++;
                        sb.append("C\n");
                    }else if(b < c){
                        b++;
                        c--;
                        sb.append("B\n");
                    }else{
                        b--;
                        c++;
                        sb.append("C\n");
                    }
                    break;
            }
            if(a < 0 || b < 0 || c < 0){
                System.out.println("No");
                return;
            }

        }


        System.out.println("Yes");
        System.out.println(sb.toString());

    }
}
