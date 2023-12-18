import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
 
public class Main implements Comparable<Main>{
  private int index;
  private int prefecture;
  private int year;
  private int rank;
 
  Main(int index,int prefecture,int year,int rank){
    this.index = index;
    this.prefecture = prefecture;
    this.year = year;
    this.rank = rank;
  }
 
  public int get_index(){
    return this.index;
  }
  public int get_pre(){
    return this.prefecture;
  }
  public int get_year(){
    return this.year;
  }
 
  public void set_rank(int rank){
    this.rank = rank;
  }
 
  public int get_rank(){
    return this.rank;
  }
 
  public int compareTo(Main id){
    if(this.prefecture<id.prefecture){
      return -1;
    }else if(this.prefecture>id.prefecture){
      return 1;
    }else{
      if(this.year<id.year){
        return -1;
      }else if(this.year>id.year){
        return 1;
      }else{
        return 0;
      }
    }
  }
  @Override
  public String toString() {
    return "Prefecture=" + this.get_pre() + ", Year=" + this.get_year();
  }
 
 
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
 
    Main[] IDs = new Main[m];
 
    for(int i=0; i<m; i++){
      IDs[i] = new Main(i+1,sc.nextInt(),sc.nextInt(),0);
    }
    Arrays.sort(IDs);
    IDs[0].set_rank(1);
    for(int i=1; i<m; i++){
      if(IDs[i-1].get_pre()==IDs[i].get_pre()){
        IDs[i].set_rank(IDs[i-1].get_rank()+1);
      }else{
        IDs[i].set_rank(1);
      }
    }
 
    //for(int i=0; i<m; i++){
      //System.out.println(IDs[i].get_rank());
    //}
 
    Arrays.sort(IDs, new Comparator<ID>() {
	    public int compare(Main id1, Main id2) {
		    return id1.get_index() - id2.get_index();
	    }
    });
    for(int i=0; i<m; i++){
      String str = String.format("%06d%06d",IDs[i].get_pre(),IDs[i].get_rank());
      System.out.println(str);
    }
 
 
 
 
 
 
 
 
 
  }
 
 
}