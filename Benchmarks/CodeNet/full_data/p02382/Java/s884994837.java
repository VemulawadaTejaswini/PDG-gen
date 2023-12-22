import java.util.Scanner;
import java.io.*;

class Main {
    public static void main(String[] args)throws IOException{ 
    	InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(in);

        int num = Integer.parseInt(read.readLine());
        int count,p;
        double d1 = 0;
        double d2 = 0;
        double d22 = 0;
        double d3 = 0;
        double d33 = 0;
        double d4 = 0;
        
        String linex = read.readLine();
        String [] splix = linex.split(" ");
        double [] x = new double [num];        
        for(count = 0; count < num; count++){
            x[count] = Double.parseDouble(splix[count]);          //????????????x    
        }  
        
        String liney = read.readLine();
        String [] spliy = liney.split(" ");
        double [] y = new double [num];        
        for(count = 0; count < num; count++){
            y[count] = Double.parseDouble(spliy[count]);          //????????????y        
        }  
        
        for(p = 1; p <= 4; p++){
        	
        	if(p == 1){
        		for(count = 0; count < num; count++){
                    d1 = d1+Math.abs(x[count]-y[count]); 
                }
        		System.out.println(d1);
        	}
        	else if(p == 2){
        		for(count = 0; count < num; count++){
                    d2 = d2+Math.abs((x[count]-y[count])*Math.abs(x[count]-y[count]));
                    d22 = Math.sqrt(d2);
                }
        		System.out.println(d22);
        	}
        	else if(p == 3){
        		for(count = 0; count < num; count++){
        			d3 = d3+Math.abs(x[count]-y[count])*Math.abs(x[count]-y[count])*Math.abs(x[count]-y[count]);
                    d33 = Math.cbrt(d3);
        		}
        		System.out.println(d33);
        	}
        	else{
        			d4 = Math.max(Math.abs(x[0]-x[num-1]),Math.abs(y[0]-y[num-1]));
        			System.out.println(d4);
        	}
        }
        
    }
}