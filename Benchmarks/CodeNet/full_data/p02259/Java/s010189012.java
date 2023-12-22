import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int number = Integer.parseInt(line);
        
        int[] array = new int[number];
        String line2 = sc.nextLine();
        String[] line2sp = new String[number];
        line2sp=line2.split(" ");
        
        for(int i=0;i<number;i++){
        	array[i]=Integer.parseInt(line2sp[i]);
        }       
        
        int count=0;
        int save=-1;
        
        for(int i=0;i<number;i++){
        	for(int j=0;j<number-1;j++){
        		if(array[j]>array[j+1]){
        			save=array[j];
        			array[j]=array[j+1];
        			array[j+1]=save;
        			count++;
        		}
        	}
        }
        
        for(int i=0;i<number-1;i++){
        	System.out.print(array[i]+" ");
        }
        
        System.out.println(array[number-1]);
        System.out.println(count);
    }   
}