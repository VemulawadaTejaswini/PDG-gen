import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
while(true){
int H=Integer.parseInt(sc.next());
int W=Integer.parseInt(sc.next());
if(H==0&&W==0){break;}
for(int i=0;i<H;i++){
    for(int t=0;t<W;t++){
        if(i==0||i==H-1){
            System.out.print("#");}else{
            if(t==0||t==W-1){System.out.print("#");
            }else{System.out.print(".");}
    }
    }System.out.println("");
}System.out.println("");
    

}
}
}
