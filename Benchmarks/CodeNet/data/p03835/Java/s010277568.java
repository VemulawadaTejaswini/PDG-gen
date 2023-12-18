import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

        int K = input.nextInt();
        int S = input.nextInt();
        int X,Y,Z;
        int count = 0;

        for(int ix=0; ix<=K; ix++){
            for(int iy=0; iy<=K; iy++){
                for(int iz=0; iz<=K; iz++){
                    X=ix;
                    Y=iy;
                    Z=iz;
                    if(X+Y+Z==S){
                        count++;
                    }else if(X+Y+Z>S){
                        break;
                    }
                }
            }
        }

        System.out.println(count);
	}
}