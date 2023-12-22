import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String[] s = new String[n];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            s[i] = sc.next();
        }

        for(int i = 0; i < n; i++){
            switch(s[i]){
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
                        if(i == n - 1){
                            a--;
                            b++;
                            sb.append("B\n");
                        }else{
                            switch(s[i + 1]){
                                case "AC":
                                    a++;
                                    b--;
                                    sb.append("A\n");
                                    break;
                                default:
                                    a--;
                                    b++;
                                    sb.append("B\n");
                            }
                        }
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
                        if(i == n - 1){
                            a++;
                            c--;
                            sb.append("A\n");
                        }else{
                            switch(s[i + 1]){
                                case "BC":
                                    c++;
                                    b--;
                                    sb.append("C\n");
                                    break;
                                default:
                                    a++;
                                    c--;
                                    sb.append("A\n");
                            }
                        }
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
                        if(i == n - 1){
                            b--;
                            c++;
                            sb.append("C\n");
                        }else{
                            switch(s[i + 1]){
                                case "AB":
                                    b++;
                                    c--;
                                    sb.append("B\n");
                                    break;
                                default:
                                    b--;
                                    c++;
                                    sb.append("C\n");
                            }
                        }
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
