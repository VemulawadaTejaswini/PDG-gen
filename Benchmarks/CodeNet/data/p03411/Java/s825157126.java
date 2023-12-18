let n = read_int()

let ab = Array.init n (fun _ -> Scanf.scanf " %d %d" (fun a b -> a, b))
let cd = Array.init n (fun _ -> Scanf.scanf " %d %d" (fun c d -> c, d))

let list = Array.make n 0
let li = ref 0

let rec f i j p =
  if i = n then p
  else
    let c, d = cd.(i) in
    let rec g j =
      if j < n then (
        let a, b = ab.(j) in
        if a < c then (
          list.(!li) <- b;
          li := !li + 1;
          g (j + 1)
        ) else j
      ) else j in
    let j = g j in
    let rec g k l m =
      if k = !li then l
      else if list.(k) < d && m < list.(k) then g (k + 1) k list.(k)
      else g (k + 1) l m in
    let l = g 0 ~-1 ~-1 in
    if l > -1 then (
      list.(l) <- list.(!li - 1);
      li := !li - 1;
      f (i + 1) j (p + 1)
    ) else f (i + 1) j p

let () =
  Array.sort (fun (x1, _) (x2, _) -> x1 - x2) ab;
  Array.sort (fun (x1, _) (x2, _) -> x1 - x2) cd;
  let ans = f 0 0 0 in
  Printf.printf "%d\n" ans
