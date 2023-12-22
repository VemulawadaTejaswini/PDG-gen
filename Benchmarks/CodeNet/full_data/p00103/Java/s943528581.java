import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class SimulatorBaseball { // Simlate baseball
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private int numIning, outCount, point;
    private int ining = 1;
    private List<Boolean> bases = new ArrayList<>(Arrays.asList(false, false, false));

    // Constructior
    SimulatorBaseball() {

    }

    void initialize() {
        outCount = 0;
        point = 0;
        Collections.fill(bases, false);
    }

    void runGame() {
        String line = null;
        try {
            line = input.readLine();
        } catch (IOException e) {
            System.out.println("IOException for numIning");
        }
        try{
            numIning = Integer.parseInt(line);
        } catch (NumberFormatException e) {
            System.out.println(line + "is not Int");
        }
        

        try {
            while (ining <= numIning){// start game
                line = input.readLine();
                switch (line) {
                case "HIT":
                    for (int i = bases.size() - 1; i >= 0; i--) {
                        Boolean base = bases.get(i);
                        if (base) {
                            if (i == 2) {
                                bases.set(i, false);
                                point++;
                            } else {
                                bases.set(i + 1, true);
                                bases.set(i, false);
                            }
                        }
                    }
                    bases.set(0, true);
                    break;
                case "HOMERUN":
                    int numOnBase = 1;
                    for (Boolean base : bases) {
                        if (base) {
                            numOnBase++;
                        }
                    }
                    point += numOnBase;
                    Collections.fill(bases, false);
                    break;
                case "OUT":
                    outCount++;
                    if (outCount == 3) {
                        System.out.println(point);
                        initialize();
                        ining++;
                    }
                    break;
                default:
                    System.out.println("errorEvent");
                }
            }
        } catch (IOException e) {
            System.out.println("IOException for event");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SimulatorBaseball simulator1 = new SimulatorBaseball();
        simulator1.runGame();
    }
}
