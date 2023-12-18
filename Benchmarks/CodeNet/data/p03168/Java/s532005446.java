<?php
$n = (int) fgets(STDIN);
$probabilities = explode(" ", trim(fgets(STDIN)));
echo getHeadsSuperior($probabilities, $n);

function getHeadsSuperior($probabilities, $n) {
    $dp = [];
    for ($i = 0; $i < $n + 1; $i++) {
        if (!isset($dp[$i])) {
            $dp[$i] = [];
        }
        for ($j = 0; $j < $n + 1; $j++) {
            if ($i === 0) {
                $dp[$i][$j] = $j === 0 ? 1 : 0;
                continue;
            }
            $dp[$i][$j] = 0;
            $dp[$i][$j] += $dp[$i - 1][$j] * (1 - $probabilities[$i - 1]);
            if ($j > 0) {
                $dp[$i][$j] += $dp[$i - 1][$j - 1] * $probabilities[$i - 1];
            }
        }
    }
    $result = 0;
    for ($i = (int) ceil(($n + 1) / 2); $i <= $n; $i++) {
      $result += $dp[$n][$i];
    }
    return $result;
}

?>