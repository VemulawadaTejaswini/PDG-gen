import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
        	double[] point = new double[8];
        	for(int i = 0;i < 8;i++){
        		point[i] = scan.nextDouble();
        	}
        	if(point[0] > point[2]){
        		if((point[2] <= point[4] && point[0] >= point[4])
        				||(point[2] <= point[6] && point[0] >= point[6])){
        			if(point[1] > point[3]){
        				if((point[3] <= point[5] && point[1] >= point[5])
                				||(point[3] <= point[7] && point[1] >= point[7])){
        					System.out.println("YES");
        				}else{
        					System.out.println("NO");
        				}
        			}else{
        				if((point[1] <= point[5] && point[3] >= point[5])
                				||(point[1] <= point[7] && point[3] >= point[7])){
        					System.out.println("YES");
        				}else{
        					System.out.println("NO");
        				}
        			}
        		}else{
        			System.out.println("NO");
        		}
        	}else{
        		if((point[0] <= point[4] && point[2] >= point[4])
        				||(point[0] <= point[6] && point[2] >= point[6])){
        			if(point[1] > point[3]){
        				if((point[3] <= point[5] && point[1] >= point[5])
                				||(point[3] <= point[7] && point[1] >= point[7])){
        					System.out.println("YES");
        				}else{
        					System.out.println("NO");
        				}
        			}else{
        				if((point[1] <= point[5] && point[3] >= point[5])
                				||(point[1] <= point[7] && point[3] >= point[7])){
        					System.out.println("YES");
        				}else{
        					System.out.println("NO");
        				}
        			}        			
        		}else{
        			System.out.println("NO");
        		}
        	}
        }
    }
}