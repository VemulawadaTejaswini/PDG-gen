import java.util.*;

class Coordinate{
    private int x, y;
    public void set(int x_cor, int y_cor){
        x = x_cor;
        y = y_cor;
    }

    public boolean exist(int x_cor, int y_cor){
        if (x == x_cor && y == y_cor){
            return true;
        }
        return false;
    }
}

class Island {
    private HashSet<Coordinate> coordinates = new HashSet<Coordinate>();

    public void new_coords(int x_cor, int y_cor) {
        Coordinate f_coordinate = new Coordinate();
        f_coordinate.set(x_cor, y_cor);
        coordinates.add(f_coordinate);
    }

    public HashSet<Coordinate> getCoordinates(){
        return coordinates;
    }

    public void clear(){
        coordinates.clear();
    }

    public boolean adjacent(int x_cor, int y_cor) {
        Iterator<Coordinate> iterator = coordinates.iterator();
        while (iterator.hasNext()) {
            Coordinate tmp_coords = iterator.next();
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    if (tmp_coords.exist(x_cor + i, y_cor + j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void merge(Island target){
        coordinates.addAll(target.getCoordinates());
        target.clear();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            HashSet<Island> islands = new HashSet<Island>();
            int w = sc.nextInt(), h = sc.nextInt();
            if (w == 0 && h == 0) break;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (sc.nextInt() == 1) {
                        Island tmp_island = new Island();
                        tmp_island.new_coords(i, j);
                        HashSet<Island> removing = new HashSet<Island>();
                        Iterator<Island> iterator = islands.iterator();
                        while (iterator.hasNext()) {
                            Island iter_island = iterator.next();
                            if (iter_island.adjacent(i, j)) {
                                tmp_island.merge(iter_island);
                                removing.add(iter_island);
                            }
                        }
                        islands.removeAll(removing);
                        islands.add(tmp_island);
                    }
                }
            }
            System.out.println(islands.size());
        }
    }
}