import java.util.*;
public class Main {
    public static void main(String[] args){
        int hw [][];
        hw = new int [100][2];
        for(int i=0;i>=0;i++){ 
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\\s");
        hw[i][0] = scan.nextInt();
        hw[i][1] = scan.nextInt();
        if(hw[i][0] == 0||hw[i][1] == 0){
            break;
        }
        }for (int k=0;k>=0;k++){
        for(int i=0; i<hw[k][0]; i++){
            for(int j=0; j<hw[k][1]; j++){
                System.out.print("#");
            }
            System.out.println("");
        }System.out.println("");
         System.out.println("");
         if (hw[k][0] == 0||hw[k][1] == 0){
             break;
         }
    }   
    }
}
