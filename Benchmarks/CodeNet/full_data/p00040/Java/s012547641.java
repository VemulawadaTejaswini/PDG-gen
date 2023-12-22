import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println(converte(sc.nextLine()));
        }
    }
    static String converte(String s) {
        String a="";
        for(int i=1;i<26;i++) {
            for(int j=0;j<26;j++) {
                a="";
                for(char c:s.toCharArray()) {
                    if(c!=' ') {
                        a+=(char)(((c-'a')*i+j)%26+'a');                
                    }else {
                        a+=c;
                    }
                }

                for(String t:a.split(" ")) {
                    if(t.equals("that")||t.equals("this")) {
                        return a;
                    }
                }
            }
        }
        return "null";
    }
}
