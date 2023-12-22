import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
        	int y = scan.nextInt();
        	int m = scan.nextInt();
        	int d = scan.nextInt();
        	if(y > 1989){
        		System.out.println("heisei " + (y - 1988) + " " + m + " " + d);
        	}else if(y > 1926){
        		if(y == 1989){
        			if(32*m + d > 39){
        				System.out.println("heisei 1 " + m + " " + d);
        			}else{
        				System.out.println("showa 64 " + m + " " + d);
        			}
        		}else{
        			System.out.println("showa " + (y - 1925) + " " + m + " " + d);
        		}
        	}else if(y > 1912){
        		if(y == 1926){
        			if(32*m + d > 408){
        				System.out.println("showa 1 " + m + " " + d);
        			}else{
        				System.out.println("taisho 15 " + m + " " + d);
        			}
        		}else{
        			System.out.println("taisho " + (y - 1911) + " " + m + " " + d);
        		}
        	}else if(y > 1868){
        		if(y == 1912){
        			if(32*m + d > 253){
        				System.out.println("taisho 1 " + m + " " + d);
        			}else{
        				System.out.println("meiji 45 " + m + " " + d);
        			}
        		}else{
        			System.out.println("meiji " + (y - 1867) + " " + m + " " + d);
        		}
        	}else{
        		if(y == 1868){
        			if(32*m + d > 295){
        				System.out.println("meiji 1 " + m + " " + d);
        			}else{
        				System.out.println("pre-meiji");
        			}
        		}else{
        			System.out.println("pre-meiji");
        		}
        	}
        }
    }
}