import java.util.*;
public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        while(true){
            int h = Integer.parseInt(sc.next());
            int w = Integer.parseInt(sc.next());
            
            if(h==0 && w==0)break;
            
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    //1行目と最終行の場合は全部#
                    if(i==0 || i==h-1) System.out.print("#");
                    //上記以外の行の場合
                    else{
                        //1列目と最終列の場合は#
                        if(j==0 || j==w-1) System.out.print("#");
                        //上記以外の列は.
                        else System.out.print(".");
                    }
                    
                }
                System.out.println("");
            }
            System.out.println("");
        }


        


    }

}

