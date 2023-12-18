import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    long l, r;
	
    l = sc.nextLong();
    r = sc.nextLong();

    boolean flag01 = false;

    if(l%2019==0){
        System.out.println(0);
        flag01 = true;
    }
    else if(r%2019==0){
        System.out.println(0);
        flag01 = true;
    }

    long min = (l*r)%2019;
    long tmp;
    boolean flag0 = false;
    if(flag01 == false){
        if(l >= 2019){
            for(int i = 1; i<r-l+1; i++)
            {  
                tmp = (l+i)%2019;
                if(tmp==0){
                    System.out.println(0);
                    flag0 = true;
                    break;
                }
                else if(min > tmp){
                    min = tmp;
                }
            }
        }
        else{
            for(int i = 1; i<r-l; i++){
                for(int j = 2; j < r-l+1; j++){
                    tmp = ((l+i)*(l+j))%2019;
                    if(tmp==0){
                        System.out.println(0);
                        flag0 = true;
                        break;
                    }
                    else if(min > tmp){
                        min = tmp;
                    }
                }
            }
        }
    }
    if(flag01 == false && flag0 == false){
        System.out.println(min);
    }
    
  }
}