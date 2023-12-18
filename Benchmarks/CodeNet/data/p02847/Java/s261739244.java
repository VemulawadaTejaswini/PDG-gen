import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        Long b = sc.nextLong();
        Long x = sc.nextLong();
        System.out.println(ret(a,b,x));
        sc.close();
    }
    static Long ret(Long a,Long b, Long x){
        Long wk = 0L;
        Long ret = 0L;
      	if((a * wk + b * (String.valueOf(wk).length())) < x){
            for(Long i = 0L; ;i++){
                wk = a * i + b * (String.valueOf(i).length());
                if(wk > x){
                    return i -1; 
                }
            }
        }else{
            return ret;
        }
        return ret;
    }
}