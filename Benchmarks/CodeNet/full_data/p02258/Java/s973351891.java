public class Main{
  main( String[] args  ){
    int n = args.length;
    int dif;
    int m=0;
    for(  int i =0;i<n-1;i++){
       dif=args[i+1]-args[i];
       if(dif>m || (dif<0&&-dif>m    ))
              m=dif;
    }
    return dif;
}




}