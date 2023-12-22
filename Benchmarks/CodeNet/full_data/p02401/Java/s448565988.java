                import java.util.Scanner;

                public class Main{
                    public static void main(String[] args){
                        int a=0,b,ans;
                        String d;
                        char c;
                        Scanner sc = new Scanner(System.in);
                    while(true){  a = sc.nextInt();
                        d = sc.next();
                        b = sc.nextInt();
                        c = d.charAt(0);
                        if(c=='+')ans = a+b;
                        else if(c=='-')ans = a-b;
                        else if(c=='*')ans = a*b;
                        else if(c=='/')ans = a/b;
                        else break;
                    
                        System.out.println(ans);
            
                    }
                    }
                }
