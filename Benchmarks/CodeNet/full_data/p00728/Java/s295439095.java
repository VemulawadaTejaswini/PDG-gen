import static java.lang.Integer.parseInt;

public class Main{
	public static void main(String[] args){
		int i,j,k,sum=0,average=0,max_index,min_index;
	
		for(i=0; parseInt(args[i])!=0; i = i+parseInt(args[i])+1){
			sum = 0;
			max_index = i+1;
			min_index = i+1;
			
			for(k=1; k<parseInt(args[i]); k++){
				if(parseInt(args[i+k]) < parseInt(args[i+k+1])){
					max_index = i+k+1;
				}
				if(parseInt(args[i+k]) > parseInt(args[i+k+1])){
					min_index = i+k+1;
				}
			}
			
			for(j=0; j<parseInt(args[i]); j++){
				if(i+j+1 != max_index && i+j+1 != min_index){
					sum += parseInt(args[i+j+1]);
				}
			}
			
			average = sum/(parseInt(args[i])-2);
			System.out.println(average);
		}
	}
}