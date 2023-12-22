import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line; // ??\???????????????????????\???
            int row = 0;
            while ((line = br.readLine()) != null) {
            	String[] list = line.split(" ", 0);
            	if(list.length == 1){
            		row = Integer.parseInt(line);
            	}else{
            		int count = 0;
            		List<Integer> numList = new ArrayList<Integer>();
            		for(int n = 0; n < row; n++){
            			int a = Integer.parseInt(list[n]);
            			numList.add(a);
            		}
            		for(int j = 0; j + 1 < row; j++){
            			int num = numList.get(j);
                		int secondNum = numList.get(j+1);
                		if(num > secondNum){
                			numList.remove(j);
                			numList.add(num);
                			j = -1;
                			count++;
                		}
            		}
            	System.out.println(count);
            	}  	
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}