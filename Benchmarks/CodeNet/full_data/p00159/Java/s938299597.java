import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while((line = in.readLine()) != null){
			int size = Integer.parseInt(line);
			if(size==0) break;
			
			Body[] data = new Body[size];
			for(int n=0; n<size; n++){
				line = in.readLine();
				String[] tmp = line.split(" ");
				int id = Integer.parseInt(tmp[0]);
				int h = Integer.parseInt(tmp[1]);
				int w = Integer.parseInt(tmp[2]);
				data[n] = new Body(id, h, w);
			}
			
			int idx = 0;
			double min = Math.abs(data[0].bmi - 22.0);
			for(int n=1; n<size; n++){
				double delta = Math.abs(data[n].bmi - 22.0);
				if(delta < min){
					idx = n;
					min = delta;
				}
				else if(delta == min){
					if(data[idx].id > data[n].id){
						idx = n;
					}
				}
			}
			
			System.out.println(data[idx].id);			
		}
	}
}

class Body{
	int id;
	double bmi;
	
	public Body(int id, int height, int weight){
		this.id = id;
		this.bmi = (double)weight / (height * height / 10000.0);
	}
}