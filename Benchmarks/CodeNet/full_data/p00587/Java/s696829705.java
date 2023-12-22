import java.io.*;
public class Main {
        public static void main(String[] args) throws IOException {
                BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

                String s;
                String t[];
                while((s = r.readLine()) != null){
                        t = s.split("[ ]");
                        if(t[0].equals("i")){
                                print_i(t[1],t[2]);
                        } else if(t[0].equals("u")){
                                print_u(t[1],t[2]);
                        }
                }
        }
        static void print_i(String a, String b){
                int i = 0,j = 0;
                char[] s = new char[a.length()];
                char[] t = new char[b.length()];
                a.getChars(0,a.length(),s,0);
                b.getChars(0,b.length(),t,0);
                while(i < a.length() && j < b.length()){
                        if(s[i] == t[j]){
                                System.out.print(s[i]);
                                i++;j++;
                        } else if(s[i] == '('){
                                while(s[i++] != ')'){
                                }   
                        } else if(t[j] == '('){
                                while(t[j++] != ')'){
                                }   
                        }   
                }   
                System.out.println("");
        }  
        static void print_u(String a, String b){ 
                int i = 0,j = 0;
                char[] s = new char[a.length()];
                char[] t = new char[b.length()];
                a.getChars(0,a.length(),s,0);
                b.getChars(0,b.length(),t,0);
                while(i < a.length() && j < b.length()){
                        if(s[i] == t[j]){
                                System.out.print(s[i]);
                                ++i;++j;
                        } else if(s[i] == '('){
                                while(s[i] != ')'){
                                        System.out.print(s[i]);
                                        ++i;
                                }
                                System.out.print(s[i]);
                                ++i;
                        } else if(t[j] == '('){
                                while(t[j] != ')'){
                                        System.out.print(t[j]);
                                        ++j;
                                }
                                System.out.print(t[j]);
                                ++j;
                        }
                }
                System.out.println("");
        }
}