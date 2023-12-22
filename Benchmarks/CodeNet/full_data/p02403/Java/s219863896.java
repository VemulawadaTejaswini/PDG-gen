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
        }
        for(int i=0; i<hw[0][0]; i++){
            for(int j=0; j<hw[0][1]; j++){
                System.out.print("#");
            }
            System.out.println("");
        }   
    }
}
