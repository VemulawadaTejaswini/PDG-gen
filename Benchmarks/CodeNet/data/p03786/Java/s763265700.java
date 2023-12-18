import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Creature{
    final int size;
    final int color;

    Creature(int size, int color){
        this.size = size;
        this.color = color;
    }

    Creature eat(Creature other){
        return new Creature(size + other.size, color);
    }

    boolean canEat(Creature other){
        return size * 2 >= other.size;
    }
}

class Solver{

    private final PriorityQueue<Creature> creatures;

    Solver(Scanner in){
        int N = in.nextInt();
        creatures = new PriorityQueue<>(Comparator.comparingInt((Creature c) -> c.size));
        for(int i = 0; i < N; i++){
            creatures.add(new Creature(in.nextInt(), i));
        }
    }

    void solve(){
        int streak = 1;
        for(Creature s = creatures.remove(); !creatures.isEmpty(); s = creatures.remove()){
            Creature b = creatures.remove();
            if(s.canEat(b)){
                creatures.add(s.eat(b));
                streak++;
            }else {
                creatures.add(b.eat(s));
                streak = 1;
            }
        }
        System.out.println(streak);
    }
}

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}