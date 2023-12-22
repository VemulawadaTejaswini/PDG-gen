import java.util.Scanner;
public class Main {
Scanner sc = new Scanner(System.in);
    int go;
    public void solve(){
        int shu=sc.nextInt();
        int kaz=sc.nextInt();
        switch(shu) {
            case 1:
            go=6000*kaz;
            break;
            case 2:
            go=4000*kaz;
            break;
            case 3:
            go=3000*kaz;
            break;
            case 4:
            go=2000*kaz;
            break;
        }
    }
    public void out(){
        System.out.println(go);
    }
    public static void main(String[] args){
        Main obj=new Main();
        for(int a=1;a<=4;a++){
            obj.solve();
            obj.out();
    }
}
}
    