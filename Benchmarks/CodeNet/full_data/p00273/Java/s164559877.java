import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    int go,day,nyuyoku,puru,Nken,Pken;
        Scanner sc=new Scanner(System.in);
        day=sc.nextInt();
       
        for(int a=0;a<=day;a++){
          nyuyoku=sc.nextInt();
          puru=sc.nextInt();
          Nken=sc.nextInt();
          Pken=sc.nextInt();
          go=nyuyoku*Nken+puru*Pken;
            if(Nken>=5 && Pken>=2){
              go=go*8/10;
              System.out.println(go);
            }else if(Nken>=5&&Pken<2){
                go=(nyuyoku*Nken+puru*2)*8/10;
                System.out.println(go);
            }else{
            System.out.println(go);
            }
        }
    }
}