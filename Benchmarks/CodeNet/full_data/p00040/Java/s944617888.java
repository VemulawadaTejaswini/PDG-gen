import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                sc.nextLine();
                String[] list = new String[52];
                for(int i = 0; i < 26; i++){
                        list[i] = f(i, 0, "that");
                        list[26+i] = f(i, 0, "this");
                }   
                while(sc.hasNext()){
                        String s = sc.nextLine();
                        String[] _s = s.split(" ");
                        int a = 0;
                        int b = 0;
                        l1:for(String tmp: _s){
                                if(tmp.length() == 4){ 
                                        for(int i = 0; i < 52; i++){
                                                for(int j = 0; j < 26; j++){
                                                        if(tmp.equals(f(1,j,list[i]))){
                                                                a = i%16;
                                                                b = j;
                                                                break l1; 
                                                        }   
                                                }   
                                        }   
                                }   
                        }   
                        System.out.println(_f(a,b,s));
                }   
                sc.close();
        }   
        static String f(int a, int b, String s){
                String tmp = ""; 
                for(int i = 0; i < s.length(); i++){
                        tmp += fb(b, fa(a, s.charAt(i)));
                }   
                return tmp;
        }   
        static char fa(int a, char c){
                return (char)((c-'a')*a%26+'a');
        }   
        static char fb(int b, char c){
                return (char)(((c-'a')+b+26)%26+'a');
        }   
        static String _f(int a, int b, String s){ 
                String tmp = ""; 
                for(int i = 0; i < s.length(); i++){
                        char c = s.charAt(i);
                        if(c != ' '){
                                c = fb(-b, c); 
                                char _c = 'a';
                                while(fa(a, _c)!=c){
                                        _c++;
                                }   
                                c = _c; 
                        }   
                        tmp += String.valueOf(c);
                }   
                return tmp;
        }   
}