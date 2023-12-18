import java.util.Scanner;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] xarray = new int[N];
    for(int i=0;i<N;i++){
      xarray[i] = sc.nextInt();
    }
    sort(xarray);
     for(int i=0;i<N;i++){
      if(i<N/2)
        System.out.println(xarray[(N/2)+1]);
                           else
        System.out.println(xarray[(N/2)]);
    }
    
  }
}
public int sort(int[] array){
  for(int i=0;i<array.length();i++){
    int areamin = array[i];
  	for(int j=i;j<array.length();j++){
    if(areamin>array[j])
      areamin = array[j];   
    }
  }
}