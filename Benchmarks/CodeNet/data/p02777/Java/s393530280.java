public class Ball{
  private String name;
  private int count;
  
  public Ball(String name,int count){
    this.name = name;
    this.count = count;
  }
  
  public String getName(){
    return this.name;
  }
  
  public void setName(String name){
    this.name = name;
  }
  
  public int getCount(){
    return this.count;
  }
  
  public void setCount(int count){
    this.count = count;
  }
   
}

public class BallGame{
  
  public void static main(String[] args){
    Ball ball1 = new Ball(args[0],args[2]);
    Ball ball2 = new Ball(args[1],args[3]);

    if(args[4].equals(ball1.name)){
      ball1.setCount(ball1.getCount()-1);
      break;
    }
    else if(args[4].equals(ball2.name)){
      ball2.setCount(ball2.getCount()-1);
    }
    
    system.out.print(ball1.getCount()+" "+ball2.getCount());
  
  
  