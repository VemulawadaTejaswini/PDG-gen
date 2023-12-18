import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long ret = 0;
        boolean maeflg = false; 
        boolean maemaeflg = false;
        long k = Long.parseLong(sc.next());
        if(s.length() == 1){
            ret = ret * k -1;
        }else if(s.length() == 2){
            if(s.substring(0,1).equals(s.substring(1,2))){
                ret = k; 
            }
        }else{
            for(int i = 0 ; i < s.length() ; i++){
                maeflg = false;
                if(i == 0){
                    if(s.substring(0,1).equals(s.substring(s.length()-1,s.length()))){
                        ret ++;
                    }
                }else if((s.substring(i,i+1).equals(s.substring(i-1,i)) && !(maemaeflg) )&&
                ((i != 1 && i != s.length()-1)||
                (i == 1 && ret != 1) ||
                ((i == s.length()-1 && s.length() != 2) && (!(s.substring(0,1).equals(s.substring(s.length()-1,s.length()))) ||
                ((s.substring(0,1).equals(s.substring(s.length()-1,s.length()))) && 
                (s.substring(0,1).equals(s.substring(1,2))) &&
                (s.substring(s.length()-2,s.length()-1).equals(s.substring(s.length()-1,s.length()))))
                ))
                )
                ){
                    ret  ++;
                    maeflg = true;
                }
                if(maeflg){
                    maemaeflg = !maemaeflg;
                }else{
                    maemaeflg = false;
                }
            }
            if(ret == s.length() -1){
                ret = ret * k -1;
            }else{
                ret *= k;
            }
        }
        System.out.println(ret);
        sc.close();
    }
}
