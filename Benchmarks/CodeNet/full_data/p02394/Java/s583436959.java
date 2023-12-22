import java.util.Scanner;

class Rectangle{
    int w;
    int h;
 
    Rectangle(int w, int h){ //?????????????????????
        this.w = w;
        this.h = h;
    }

    boolean judgeInRectangle(Circle c){
        if (c.x - c.r < 0 || c.y - c.r < 0)
            return false;
        if (c.x + c.r > w || c.y + c.r > h)
            return false;
        return true;
    }
}

class Circle{
    int x;
    int y;
    int r;

    Circle(int x, int y, int r){
        this.x = x;
        this.y = y;
        this.r = r;
    }
}

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int W = Integer.parseInt(scan.next());
        int H = Integer.parseInt(scan.next());
        int x = Integer.parseInt(scan.next());
        int y = Integer.parseInt(scan.next());
        int r = Integer.parseInt(scan.next());
        
        Rectangle rec = new Rectangle(W, H);
        Circle cir = new Circle(x, y, r);

        if (rec.judgeInRectangle(cir))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}