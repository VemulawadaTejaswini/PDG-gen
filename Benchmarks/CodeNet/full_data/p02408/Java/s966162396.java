import java.util.Scanner;
 
class Main {
    Scanner sc = new Scanner(System.in);
 
    boolean[][] cards=new boolean[4][14];
     
    public int StoI(String s){
        if("S".equals(s)){
            return 0;
        }else if("H".equals(s)){
            return 1;
        }else if("C".equals(s)){
            return 2;
        }else{
            return 3;
        }
    }
    public String ItoS(int i){
        switch(i){
        case 0:return "S";
        case 1:return "H";
        case 2:return "C";
        case 3:return "D";
        default:return null;
        }
    }
     
    public void run() {
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            String type=sc.next();
            int num=sc.nextInt();
            cards[StoI(type)][num]=true;
        }
         
        for(int c=0;c<4;c++)for(int i=1;i<=13;i++){
            if(!cards[c][i]){
                ln(ItoS(c)+" "+i);
            }
        }
    }
 
    public static void main(String[] args) {
        new Main().run();
    }
 
    public static void pr(Object o) {
        System.out.print(o);
    }
 
    public static void ln(Object o) {
        System.out.println(o);
    }
 
    public static void ln() {
        System.out.println();
    }
}
