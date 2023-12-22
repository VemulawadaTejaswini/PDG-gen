import java.io.*;
 
class Main{
    public static void main(String[] args) throws IOException{
     
        int x,y,z,temp;
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        x = Integer.parseInt(str[0]);
        y = Integer.parseInt(str[1]);
	z = Integer.parseInt(str[2]);

	for(int i=0; i<3; i++){
		if(z<y){
			temp=y;
			y=z;
			z=temp;
		}else if(y<x){
			temp=x;
			x=y;
			y=temp;
		}
	}

	System.out.println(x + " " + y + " " + z);
    }
}